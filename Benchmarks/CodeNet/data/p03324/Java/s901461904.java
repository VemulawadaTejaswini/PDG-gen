1. import java.util.*;			
2.  			
3. public class Main {			
4.  			
5. public static void main(String[] args) {			
6. Scanner sc = new Scanner(System.in);			
7. int d = sc.nextInt();			
8. int n = sc.nextInt();			
9. int res = (int) Math.pow(100, d);			
10.  			
11. if (n < 100) {			
12. System.out.println(res * n);			
13. } else {			
14. System.out.println(res * 101);			
15. }			
16. }			
17. }			
