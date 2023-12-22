class Solution{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int k = input.nextInt();
    int a = input.nextInt();
    int b = input.nextInt();
    input.close();
    
    int mod = b % a;
    if(mod >= k) System.out.println("OK");
    else System.out.println("NG");
  }
}
