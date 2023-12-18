import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int arr[] = new int[3];
    for(int i = 0 ; i < 3 ; i++){
      arr[i] = scan.nextInt();
    }
    int sum = 0 ; 
	int min = Math.min(arr[1],arr[2]);
    int max = Math.max(arr[1],arr[2]);
    sum+=Math.abs(min - arr[0]);
    sum+=Math.abs(max-min);
    System.out.println(sum);
    
  }
}
