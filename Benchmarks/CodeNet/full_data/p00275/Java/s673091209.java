import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int n,ba = 0,jun = 0;
	String a;
	while(true){
	    n = scan.nextInt();
	    if(n == 0) break;
	    int[] mochi = new int[n];
	    a = scan.next();
	    char fuda[] = a.toCharArray();
	    for(int i = 0; i<100; i++){
		switch(fuda[i]){
		case 'M':
		    if(jun == n) jun = 0;
		    mochi[jun] += 1;
		    jun++;
		    break;
		case 'S':
		    if(jun == n) jun = 0;
		    ba += mochi[jun] + 1;  //banidasu
		    mochi[jun] =0;  //mochifudazero
		    jun++;
		    break;
		case 'L':
		    if(jun == n) jun = 0;
		    mochi[jun] += ba +1;
		    ba = 0;
		    jun++;
		    break;
		}
	    }
	    Arrays.sort(mochi);
	    for(int i = 0;i<mochi.length;i++){
		System.out.print(mochi[i]);
		System.out.print(" ");
	    }
	    System.out.println(ba);
	    jun = 0; ba = 0;
	}
    }
}