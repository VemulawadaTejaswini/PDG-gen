public class Main{
 public static void main(String[] args){
  try (Scanner sc = new Scanner(System.in));
   while(true){
    final int H = sc.nextInt();
    final int W = sc.nextInt();
    if(H == 0 && W == 0){
     break;
    }
    for(int y = 0; y < H; y++){
     for(int x = 0; x < W; x++){
      System.out.println("0");
     }
     System.out.println("#\n");
    }
   System.out.println("#");
  }
 }
}