/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int h = sc.nextInt(),w=sc.nextInt();
	
	char[][] map = new char[h][w];
	for(int i = 0; i < h; i++) {
	     for(int j = 0; j < w; j++) {
	         map[i][j]=sc.nextchar();
	     }
	}

HashSet<Integer>  yset = new HashSet<>,xset=new HashSet<>;
	IntStream.range(0,100).forEach(i -> {
	    yset.add(i);
	    xset.add(i);
	});

	for(int y = 0;y<h;y++) {
 if(Arrays.stream(map[y]).allMatch(c->c=='.')) yset.remove(y);
} 
for(int x = 0; x < w;x++){
for(int y = 0;y < h; y++){
if(map[y][x]!='#'){
xset.remove(x);
break;
}
}
}
yset.stream().forEach(y-> {
xset.stream().forEach(x-> System.out.print(map[y][x]));
System.out.println();
}
	}
}