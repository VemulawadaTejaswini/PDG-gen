public class Main{
 Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();
        int train = N*A;
        if(train < B){
        	System.out.println(train);
        }else{
        	System.out.println(B);
        } 
}