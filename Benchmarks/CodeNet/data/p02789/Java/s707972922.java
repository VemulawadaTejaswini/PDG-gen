class A{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int first = scanner.nextInt();
    int second = scanner.nextInt();
    if(first >= 1 && first <= 100 && second >= 0 && second <= first){
      if(first == second){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}