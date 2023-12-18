import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
      	int now = 100;
      	int p = 0;
      	int i =0;

	while (x > now){
      p = (int) (now*0.01);
      now = now + p;
      i++;
    }
            System.out.println(i);
    }
}