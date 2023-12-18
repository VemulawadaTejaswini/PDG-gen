import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String[] str_array = str.split(" ");
    int n = Integer.parseInt(str_array[0]);
    int x = Integer.parseInt(str_array[1]);
    int y = Integer.parseInt(str_array[2]);
    // int[] dst_count = new int[n-1];
    // int[][] dst = new int[n][n-1];
    // for(int i=0; i<n-1; i++){
    //   dst_count[i] = 0;
    // }
    // for(int i=0; i<n; i++){
    //   for(int j=i+1; j<n-1; j++){
    //             if(i+1 < x && x < j+1){
    //       if(i+1 < y && y < j+1){
    //         dst[i][j] = (x-(i+1)) + 1 + ((j+1)-y);
    //       } else{
    //         dst[i][j] = j-i;
    //         if(dst[i][j] > (x-(i+1))+1+(y-(j+1))) dst[i][j] = (x-(i+1))+1+(y-(j+1));
    //       }
    //     } else{
    //       if(i+1 < y && y < j+1){
    //         dst[i][j] = j-i;
    //         if(dst[i][j] > ((i+1)-x)+1+((j+1)-y)) dst[i][j] = ((i+1)-x)+1+((j+1)-y);
    //       }else{
    //         dst[i][j] = j-i;
    //         if(dst[i][j] > ((i+1)-x)+1+(y-(j+1))) dst[i][j] = ((i+1)-x)+1+(y-(j+1));
    //       }
    //     }
    //     for(int k=1; k <= n; k++){
    //       if(dst[i][j] == k) dst_count[k-1]++;
    //     }
    //   }
    // }
    // for(int i=0; i<n-1; i++){
    //   System.out.println(dst_count[i]);
    // }
    int[][] dst = new int[n][n];
    // initialize
    for(int i=0; i< n-1; i++){
      for(int j=0; j< n-1; j++){
        dst[i][j] = n+1;
      }
    }
    // distance without X & Y
    for(int i=1; i <= n-1; i++){
      for(int j=0; j < n-i; j++){
        dst[j][j+i] = i;
      }
    }
    // distance with X & Y
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        if(y+j-1 < n && x+i < y+j){
          if(dst[(x-1)+i][(y-1)+j] > 1+i+j) dst[(x-1)+i][(y-1)+j] = 1+i+j;
        }
        if(y+j-1 < n && x-i-1 >= 0){
          if(dst[(x-1)-i][(y-1)+j] > 1+i+j) dst[(x-1)-i][(y-1)+j] = 1+i+j;
        }
        if(x-i-1 >= 0 && x-i< y-j){
          if(dst[(x-1)-i][(y-1)-j] > 1+i+j) dst[(x-1)-i][(y-1)-j] = 1+i+j;
        }
        if(x+i < y-j){
          if(dst[(x-1)+i][(y-1)-j] > 1+i+j) dst[(x-1)+i-1][(y-1)-j] = 1+i+j;
        }
      }
    }
    // prepare dst_count
    int[] dst_count = new int[n];
    for(int k=1; k<=n; k++){
      dst_count[k-1] = 0;
    }
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        for(int k=1; k<=n; k++){
          if(dst[i][j] == k){
            // System.out.println("("+(i+1)+","+(j+1)+")="+k);
            dst_count[k-1]++;
          }
        }
      }
    }
    for(int k=1; k<n; k++){
      System.out.println(dst_count[k-1]);
    }
  }
}
