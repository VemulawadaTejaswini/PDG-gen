import java.util.Scanner;


public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();
        int answer;


        switch(b){

        case"+":
        answer = a+c;
        break;

        case"-":
        answer = a-c;
        break;

        case"*":
        answer = a*c;
        break;
        
        case"/":
        answer = a/c;
        break;

        default:
        return;

        }
        

        System.out.println(answer);

    }
    
}

