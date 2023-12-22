import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            String line=s.nextLine();
            for(int i=0;i<26;i++){
                String now="";
				StringBuffer sb = new StringBuffer();
                for(int j=0;j<line.length();j++){
                    if(line.charAt(j)>='a'&&line.charAt(j)<='z'){
                        sb.append((char)('a'+(line.charAt(j)-'a'+i)%26));
                    }else sb.append(line.charAt(j));
                }
				now = sb.toString();
                boolean ok=false;
                for(int j=0;j<now.length()-2;j++){
                    if(now.charAt(j)=='t'&&now.charAt(j+1)=='h'&&now.charAt(j+2)=='e')ok=true;
                }
                for(int j=0;j<now.length()-3;j++){
                    if(now.charAt(j)=='t'&&now.charAt(j+1)=='h'){
                        if(now.charAt(j+2)=='i'&&now.charAt(j+3)=='s')ok=true;
                        if(now.charAt(j+2)=='a'&&now.charAt(j+3)=='t')ok=true;
                    }
                }
                if(ok){
                    System.out.println(now);
                    break;
                }
            }
        }
    }
}