import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    for(int i =1;i<6;i++){
	        int a = s.nextInt();
	        if(a==0){
                System.out.println(i);
                break;
            }
        }
    }
}