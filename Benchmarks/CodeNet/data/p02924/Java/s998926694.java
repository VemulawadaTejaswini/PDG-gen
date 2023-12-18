public class Sample {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
    int result = 0;
    
    if(N != 1){
      result = N * (N - 1) / 2;
    }
    print(result);

  }

}