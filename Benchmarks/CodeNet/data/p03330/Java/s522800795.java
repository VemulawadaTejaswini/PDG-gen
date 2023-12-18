import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[][] table = new int[c + 1][c + 1];
		for (int i = 1; i <= c; i++) {
		    for (int j = 1; j <= c; j++) {
		        table[i][j] = sc.nextInt();
		    }
		}
		ArrayList<Integer>[] lists = new ArrayList[3];
		for (int i = 0; i < 3; i++) {
		    lists[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= n; j++) {
		        lists[(i + j) % 3].add(sc.nextInt());
		    }
		}
		Color[][] order = new Color[3][c];
		PriorityQueue<Color> queue = new PriorityQueue<>();
		for (int i = 0; i < 3; i++) {
		    for (int j = 1; j <= c; j++) {
		        int sum = 0;
		        for (int x : lists[i]) {
		            sum += table[x][j];
		        }
		        order[i][j - 1] = new Color(i, j, sum);
		    }
		    Arrays.sort(order[i]);
		}
		long min = Long.MAX_VALUE;
		
		long type01 = order[0][0].sum;
		int color0 = order[0][0].color;
		int color01 = 0;
		for (int i = 0; i < c; i++) {
		    if (order[1][i].color != color0) {
		        type01 += order[1][i].sum;
		        color01 = order[1][i].color;
		        break;
		    }
		}
		for (int i = 0; i < c; i++) {
		    if (order[2][i].color != color0 && order[2][i].color != color01) {
		        min = Math.min(min, type01 + order[2][i].sum);
		        break;
		    }
		}
		long type02 = order[0][0].sum;
		int color02 = 0;
		for (int i = 0; i < c; i++) {
		    if (order[2][i].color != color0) {
		        type02 += order[2][i].sum;
		        color02 = order[2][i].color;
		        break;
		    }
		}
		for (int i = 0; i < c; i++) {
		    if (order[1][i].color != color0 && order[1][i].color != color02) {
		        min = Math.min(min, type02 + order[1][i].sum);
		        break;
		    }
		}
		
		long type10 = order[1][0].sum;
		int color1 = order[1][0].color;
		int color10 = 0;
		for (int i = 0; i < c; i++) {
		    if (order[0][i].color != color1) {
		        type10 += order[0][i].sum;
		        color10 = order[0][i].color;
		        break;
		    }
		}
		for (int i = 0; i < c; i++) {
		    if (order[2][i].color != color1 && order[2][i].color != color10) {
		        min = Math.min(min, type10 + order[2][i].sum);
		        break;
		    }
		}
		long type12 = order[1][0].sum;
		int color12 = 0;
		for (int i = 0; i < c; i++) {
		    if (order[2][i].color != color1) {
		        type12 += order[2][i].sum;
		        color12 = order[2][i].color;
		        break;
		    }
		}
		for (int i = 0; i < c; i++) {
		    if (order[0][i].color != color1 && order[0][i].color != color12) {
		        min = Math.min(min, type12 + order[0][i].sum);
		        break;
		    }
		}
		
		long type20 = order[2][0].sum;
		int color2 = order[2][0].color;
		int color20 = 0;
		for (int i = 0; i < c; i++) {
		    if (order[0][i].color != color2) {
		        type20 += order[0][i].sum;
		        color20 = order[0][i].color;
		        break;
		    }
		}
		for (int i = 0; i < c; i++) {
		    if (order[1][i].color != color2 && order[1][i].color != color20) {
		        min = Math.min(min, type20 + order[1][i].sum);
		        break;
		    }
		}
		long type21 = order[2][0].sum;
		int color21 = 0;
		for (int i = 0; i < c; i++) {
		    if (order[1][i].color != color2) {
		        type21 += order[1][i].sum;
		        color21 = order[1][i].color;
		        break;
		    }
		}
		for (int i = 0; i < c; i++) {
		    if (order[0][i].color != color2 && order[0][i].color != color21) {
		        min = Math.min(min, type21 + order[0][i].sum);
		        break;
		    }
		}
	    System.out.println(min);
   }
   
   static class Color implements Comparable<Color> {
       int type;
       int color;
       int sum;
       
       public Color(int type, int color, int sum) {
           this.type = type;
           this.color = color;
           this.sum = sum;
       }
       
       public int compareTo(Color another) {
           return sum - another.sum;
       }
       
       public String toString() {
           return "type:" + type + " color:" + color + " sum:" + sum;
       }
   }
}


