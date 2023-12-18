import java.util.Scanner;
   
class abc131c{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long count = 0;
        for(long i = A; i <= B; i++){
            if(i%C!=0 && i%D!=0) count++;
        }
        System.out.println(count);
    }
}
