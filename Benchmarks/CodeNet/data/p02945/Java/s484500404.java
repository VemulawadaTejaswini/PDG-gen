import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      	Scanner sc = new Scanner(System.in);
      	int N1 = sc.nextInt();
      	int N2 = sc.nextInt();      
        System.out.println(N1+N2<N1-N2?N1-N2:N1+N2<N1*N2?N1*N2:N1+N2);
    }
}
