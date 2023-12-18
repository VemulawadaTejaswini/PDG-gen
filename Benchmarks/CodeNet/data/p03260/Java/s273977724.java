import java.util.Scanner
class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if((A*B)%2 == 0){
        System.out.println("YES);
        }else{
        System.out.println("NO")
        }
      }
   }