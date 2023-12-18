public class main {
    public static void main(String[] args) {

	int a;
	int b;

	a = Integer.parseInt(br.readLine());     
	b = Integer.parseInt(br.readLine());

	if ((a + b) % 2 == 0){      
    System.out.println((a+b)%2);
	} 
     else {                    
    System.out.println("IMPOSSIBLE");
	}
    }
}
      