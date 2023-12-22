import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
		String[] str = line.split(" ", 0);
        long a = Integer.parseInt(str[0]);
        long b = Integer.parseInt(str[1]);
        long c = Integer.parseInt(str[2]);
        long d = Integer.parseInt(str[3]);
        
		long max = 0;

      	for(int i=0;i<=3;i++){
          	max = a * c;
			if(max < a * d){
              	max = a * d;
            }
			if(max < b * c){
              	max = b * c;
            }
   			if(max < b * d){
              	max = b * d;
            }
        }
      
		System.out.println(max);
    }
}