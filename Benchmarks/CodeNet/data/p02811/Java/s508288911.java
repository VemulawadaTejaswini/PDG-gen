public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       int K = sc.nextInt();
       int X = sc.nextInt();

       while(K<=X){
             K+=K;
}
      if(K==X){
         System.out.println("Yes");
}
      else{
         System.out.println("No");
}
}
}