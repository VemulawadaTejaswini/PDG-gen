import java.util.Arrays;

public class Main
{
	public static void main( String[] args ) {
		int[] mount = {1819,2003,876,2840,1723,1673,3776,2848,1592,922};

		int max1 = 0,max2 = 0,max3 = 0;
		int[] max = {0,0,0};
		for ( int i = 0; i < mount.length; i++ ) {
			int i1 = mount[ i ];
			if(max[0] < i1){
				max[2] = max[1];
				max[1] = max[0];
				max[0] = i1;
			}
			else if(max[1] < i1){
				max[2] = max[1];
				max[1] = i1;

			}
			else if(max[2] < i1){
				max[2] = i1;
			}
		}
		Arrays.sort(max);
		for ( int i = max.length-1; i >= 0; i-- ) {
			System.out.println(max[i]);
		}

	}
}