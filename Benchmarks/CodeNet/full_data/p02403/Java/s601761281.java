import java.util.*;

class Main{

 static void java(int H,int W){
   for(int i = 0; i < H i++){
    for(int u = 0; u < W; u++)
    System.out.print('#');
   System.out.println();
}
}

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
   while(sc.hasNextInt()){
 int H = sc.nextInt();
 int W = sc.nextInt();
  if(H == 0 && W == 0)break;
 java(H,W);
}
}
}