import java.util.*;
import java.lang.*;
import java.awt.*;

//update 2020/1/1 23:01

public class Main{

  static Scanner sc = new Scanner(System.in);
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    int h = nextInt();
    int w = nextInt();
    String[] sss = new String[h];
    String[][] s = new String[h][w];
    for(int i=0;i<h;i++){
      sss[i] = next();
      s[i] = splitString(sss[i]);
    }

    int xxx = 0;

    //全通りでやる。
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        if(s[i][j].equals(".")){
        for(int k=0;k<h;k++){
          for(int l=0;l<w;l++){

            if(s[k][l].equals(".")){
              //main
              String[][] ss = new String[h][w];
              for(int x=0;x<h;x++){
                ss[x] = splitString(sss[x]);
              }
              int ans = SearchRoute(i,j,k,l,ss);
              xxx = Math.max(ans,xxx);
            }

          }
        }
      }
      }
    }


    System.out.println(xxx);

  }
  static int SearchRoute (int sx, int sy, int gx, int gy, String[][] ar) {
	Deque<Point> p = new ArrayDeque<>();
	p.add(new Point(sx,sy));
	int moves = 0;
	ar[sx][sy] = "0";
	int[] dx = {-1,1,0,0}, dy = {0,0,-1,1};
	int s,i,j;
	while (true) {
		s = p.size();
		for (int k=0; k<s; k++) {
			i = p.getFirst().x;
			j = p.removeFirst().y;
			for (int a=0; a<4; a++) {
				if (i+dx[a]<0 || ar.length-1<i+dx[a] || j+dy[a]<0 || ar[0].length-1<j+dy[a]) {
					continue;
				}
				if (ar[i+dx[a]][j+dy[a]].equals(".")==false) {continue;}
				ar[i+dx[a]][j+dy[a]] = String.valueOf(moves+1);
				p.addLast(new Point(i+dx[a],j+dy[a]));
			}
		}
		moves++;
		if (s == 0) {break;}
	}
	if (ar[gx][gy].equals(".")) {return -1;}
	return Integer.parseInt(ar[gx][gy]);
  }
  /*
    static String toSmall(String s){
      char c = s.charAt(0);
      //if(Character.isUpperCase(c)){
      if(c<=90){
        c += 32;
      }
      return String.valueOf(c);
    }
    static String toBig(String s){
      char c = s.charAt(0);
      //if(Character.isLowerCase(c)){
      if(c>=97){
        c -= 32;
      }
      return String.valueOf(c);
    }
  */

  static String toSmall(String s){
    return s.toLowerCase();
  }

  static String toBig(String s){
    return s.toUpperCase();
  }

  static String next(){
    return sc.next();
  }

  static int nextInt(){
    return Integer.parseInt(sc.next());
  }

  static long nextLong(){
    return Long.parseLong(sc.next());
  }

  static double nextDouble(){
    return Double.parseDouble(sc.next());
  }

  static String[] splitString(String s){
    return s.split("");
  }

  static char[] splitChar(String s){
    return s.toCharArray();
  }

  static int charToInt(char a){
    return a - 48;
  }

////////////////////////////////////////////
  public static int max(int[] a){
    int lng = a.length;
    int max = a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }
  public static long max(long[] a){
    int lng = a.length;
    long max = a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }
////////////////////////////////////////////

////////////////////////////////////////////
  public static int min(int[] a){
    int lng = a.length;
    int min = a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }
  public static long min(long[] a){
    int lng = a.length;
    long min = a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }
////////////////////////////////////////////

}
