import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),
        b=sc.nextInt(),c=sc.nextInt();
        for(int i=1;i<=b;i++){
            if((a*i)%b==c){
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
       sc.close();
    }
} 

 
