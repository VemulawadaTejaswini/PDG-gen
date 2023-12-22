import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
      	long now = 100;
      	double p = 0;
      	int i =0;

	while (x > now){
      p = now * 0.01;
      now = now + (long)p;
      i++;
    }
            System.out.println(i);
    }
}