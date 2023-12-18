import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean result=true;

        if(s.length()<=26||s.length()>=2){
            for(int i=0;i<s.length()-1;i++){
                for(int j=i+1;j<s.length()-1;j++){
                    char a=s.charAt(i);
                    char b=s.charAt(j);
                    if(a==b){
                        result=false;
                    }
                }
            }
        }

        if(result){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
