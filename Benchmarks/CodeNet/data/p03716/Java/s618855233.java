import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] array = new int[3*N+1];
	for(int i = 0; i<3*N; i++) {
	    array[i] = sc.nextInt();
	}
	long front,end;
	//区切り
	long max = -100000;
	for(int middle = N; middle<2*N; middle++) {
	    int[] aclone = copyArray(array);
	    Arrays.parallelSort(aclone, 0,middle);
	    Arrays.parallelSort(aclone,middle,3*N);
	    /*
	    for(int i: aclone) {

		System.out.print(i);
	    }
	    System.out.println();
	    */
	    // front
	    front = 0;
	    end = 0;
	    for(int i = middle-1; middle-i<=N; i--) {
		front += aclone[i];
	    }
	    for(int i = middle; i-middle<N; i++) {
                end += aclone[i];
            }
	    max = Math.max(max, front-end);
	    //System.out.println(front + " " + end + " " + max);
	}
	System.out.println(max);
    }
    public static int[] copyArray(int[] array) {
	int[] ca = new int[array.length];
	for(int i  = 0; i< array.length; i++) {
	    ca[i] = array[i];
	}
	return ca;
    }
}