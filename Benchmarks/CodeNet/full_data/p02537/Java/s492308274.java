/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		System.out.println(lengthOfLISAtLeastK(a,k));
	}
	public static int lengthOfLISAtLeastK(int[] nums, int K) {
    if ( nums == null ) return 0;
    if ( nums.length <= 1 ) return nums.length;
    List<Integer> list = new ArrayList<Integer>(nums.length);
    list.add( 0, nums[0] );
    for ( int i = 1; i < nums.length; i++ ) {
        if ( Math.abs(nums[i] - list.get( list.size() - 1 )) <= K ) {
            list.add( nums[i] );
        } else  {
            int index = Collections.binarySearch( list, nums[i] );
            if ( index >= 0 && index < nums.length ) {
                list.set( index, nums[i] );
            } else {
                if ( -index - 1 > list.size() - 1 ) {
                    if ( Math.abs(nums[i] - list.get(list.size()-1)) <= K ) {
                        list.add(nums[i]);
                    }
                } else {
                     if ( -index - 1 == 0 ) {
                        list.set(-index-1, nums[i]);
                    } else if ( Math.abs(nums[i] - list.get(-index-2)) <= K ) {
                        list.set(-index-1, nums[i]);
                    }
                }
            }
        }
    }
    return list.size();
}
}