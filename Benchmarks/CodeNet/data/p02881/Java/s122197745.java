import java.util.Scanner;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
      	ArrayList<Long> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
      	for (long i = 1; i*i <= n; i++) { 
          if (n%i == 0) {
              list.add(i);       
              if (i != n / i) {
                  list.add(n/i);
              }
          }
        }

        long x = list.get(list.size()-2);
        long y = list.get(list.size()-1);
        System.out.println(x+y-2);
          
	}
}