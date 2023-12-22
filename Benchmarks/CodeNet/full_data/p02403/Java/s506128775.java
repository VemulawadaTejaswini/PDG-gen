import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    while(true){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String[] str2 = str1.split(" ");
    int H = Integer.parseInt(str2[0]);
    int W = Integer.parseInt(str2[1]);

    if(H == 0 && W == 0) {break;}

    for (int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        System.out.print("#");
      }
      System.out.println();
    }
    System.out.println();
    }
  }
}