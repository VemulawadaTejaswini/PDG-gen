import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=n%10;
        int b=(n/10)%10;
        int c=n/100;
        if(a==7||b==7||c==7){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        
    }
}