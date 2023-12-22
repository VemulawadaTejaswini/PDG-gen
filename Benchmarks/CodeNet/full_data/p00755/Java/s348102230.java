import java.util.*;

class Main{
  static int w,h,c;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while(true) {
      w = scan.nextInt();
      h = scan.nextInt();
      c = scan.nextInt();
      if(w==0) break;
      int[][] arr = new int[w][h];
      for(int i = 0; i < w; i++) {
        for(int j = 0; j < h; j++) {
          arr[i][j] = scan.nextInt();
        }
      }
      int result = calc(arr,1,c);
      System.out.println(result);
    }
  }

  static int calc(int[][] arr, int count, int lastColor) {
    int result = 0;
    for(int i = 1; i <= 6; i++) {
      if(arr[0][0]==i) continue;
      int[][] copyArr = cloneArray(arr);
      changeColor(copyArr,i,0,0,new boolean[w][h]);
/*
        System.out.println(count+","+i);
        for(int j = 0; j < arr.length; j++) System.out.println(Arrays.toString(copyArr[j]));
        System.out.println();
*/
      if(count==5) {
        result = Math.max(result,countColor(copyArr,lastColor,0,0,new boolean[w][h]));
      }else {
        result = Math.max(result,calc(copyArr,count+1,lastColor));
      }
    }
    return result;
  }

  static void changeColor(int[][] arr, int color, int x, int y, boolean[][] checked) {
    if(checked[x][y]) return;
    checked[x][y] = true;
    if(x+1<arr.length && arr[x+1][y]==arr[x][y]) changeColor(arr,color,x+1,y,checked);
    if(y+1<arr[x].length && arr[x][y+1]==arr[x][y]) changeColor(arr,color,x,y+1,checked);
    if(x-1>=0 && arr[x-1][y]==arr[x][y]) changeColor(arr,color,x-1,y,checked);
    if(y-1>=0 && arr[x][y-1]==arr[x][y]) changeColor(arr,color,x,y-1,checked);
    arr[x][y] = color;
  }

  static int countColor(int[][] arr, int color, int x, int y, boolean[][] checked) {
    if(checked[x][y]) return 0;
    checked[x][y] = true;
    int result = 0;
    if(x+1<arr.length && arr[x+1][y]==arr[x][y]) result+=countColor(arr,color,x+1,y,checked);
    if(y+1<arr[x].length && arr[x][y+1]==arr[x][y]) result+=countColor(arr,color,x,y+1,checked);
    if(x-1>=0 && arr[x-1][y]==arr[x][y]) result+=countColor(arr,color,x-1,y,checked);
    if(y-1>=0 && arr[x][y-1]==arr[x][y]) result+=countColor(arr,color,x,y-1,checked);
    if(arr[x][y] == color) result++;
    return result;
  }

  static int[][] cloneArray(int[][] arr) {
    int[][] returnArray = new int[arr.length][];
    for(int i = 0; i < arr.length; i++) {
      returnArray[i] = new int[arr[i].length];
      for(int j = 0; j < arr[i].length; j++) {
        returnArray[i][j] = arr[i][j];
      }
    }
    return returnArray;
  }
}