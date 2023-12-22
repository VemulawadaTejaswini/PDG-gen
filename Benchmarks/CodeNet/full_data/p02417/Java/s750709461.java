import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        char compare;
        String in="";
        String input="";
        char[] text=new char[1000];
        int count=0;
        boolean flag=true;
        while(flag){
            in=scan.nextLine();
            text=in.toCharArray();
            for(int i=97;i<=122;i++){
                compare=(char)(i);
                count=0;
                for(int j=0;j<text.length;j++){
                    if(text[j]=='.'){flag=false;}
                    if(text[j]==compare||text[j]==Character.toUpperCase(compare)){
                        count+=1;
                    }
                }
                System.out.println(compare+" : "+count);
            }
        }
    }
}