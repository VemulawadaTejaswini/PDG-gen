
import java.util.Scanner;
 
public class Main{
public static void main(String[] args){
    int m,f,r;
    Scanner sc = new Scanner(System.in);
    while(true){
        m=sc.nextInt();
        f=sc.nextInt();
	r=sc.nextInt();
        if(m==-1&&f==-1&&r==-1){
            break;
        }else if(m==-1||f==-1||m+f<30){
		System.out.printf("F\n");
	}else if(m+f<50&&r<50){
		System.out.printf("D\n");
	}else if(m+f<65){
		System.out.printf("C\n");
	}else if(m+f<80){
		System.out.printf("B\n");
	}else{
		System.out.printf("A\n");
	}
    }
 
}
}