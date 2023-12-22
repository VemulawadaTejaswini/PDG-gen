import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean bool = false;
        String str[]=sc.nextLine().split(" ");
        for(int k=0;k<26;k++){
            for(int i=0;i<str.length;i++){
                char ch[]=str[i].toCharArray();
                for(int j=0;j<ch.length;j++){
                    if(Character.isLowerCase(ch[j])){//
                    	 ch[j]=(char)((ch[j]-'a'+1)%26+'a');
//                    	 ch[j]=(char)((ch[j]+1)%26+'a');  
//                    	 System.out.println(k+" "+ch[j]+" "+(int)ch[j]);
                    }
                }//for j
                str[i]=new String(ch);
                
                if(str[i].equals("the")||str[i].equals("this")||str[i].equals("that"))
                    bool=true;
            }//for i
            if(bool) break;
        }//for k
        
        
        boolean f=true;
        for(int i=0;i<str.length;i++){
            if(!f)System.out.print(" ");
            f=false;
            System.out.print(str[i]);
        }
        System.out.println();
    }
}