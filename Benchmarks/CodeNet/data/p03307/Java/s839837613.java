  public class Main{
    public static void main(String[] args){
    // Scanner sc = new Scanner();
    // int n = sc.nextInt();
    int n = 55;
    int max = 1000;
    int answer;
    for(int i = 0;i<max;i++){
      if((i%n == 0) && (i%2 == 0)){
        answer = i;
      }
    }
    System.out.println(answer);
  }

}