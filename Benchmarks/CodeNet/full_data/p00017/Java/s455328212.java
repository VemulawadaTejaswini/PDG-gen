import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Pattern p=Pattern.compile("the|this|that");
        String str;
        
            while((str=br.readLine())!=null){
                char[] ch=str.toCharArray();
                for(int j=0;!p.matcher(str).find()&&j<26;j++){
                    for(int i=0;i<ch.length;i++){
                        if('a'<=ch[i]&&ch[i]<'z'){
                            ch[i]++;
                        }else if(ch[i]=='z'){
                            ch[i]='a';
                        }
                    }
                    if(p.matcher(String.valueOf(ch)).find()){
                        break;
                    }
                }
                System.out.println(ch);
            }
        
    }
}