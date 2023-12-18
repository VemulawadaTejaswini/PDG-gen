import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
int p=1;

if(a.length()+1!=b.length()){
    p=0;
}


       if(a.length()+1==b.length()){
            for (int i=0;i<a.length();i++){
                if((a.charAt(i))!=b.charAt(i)){
                    p=0;
                    break;
                }
            }

            }


       if(p==1){
           System.out.println("Yes");
       }
        if(p==0){
            System.out.println("No");
        }
        }

}