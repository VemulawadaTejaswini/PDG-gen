import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,count=0,a,b;
        char c;
        for(i=0; ;i++){
            if(count%3==0){
                a=sc.nextInt();
            }else if(count%3==2){
                b=sc.nextInt();
            }else{
                c=sc.next();
            }
            
            if(c=="+"){
                System.out.println(a+b);
            }else if(c=="-"){
                System.out.println(a-b);
            }else if(c=="*"){
                System.out.println(a*b);
            }else if(c=="/"){
                System.out.println(a/b);
            }else{
                break;
            }
            count++;
        }
    System.out.println();
    }
}
