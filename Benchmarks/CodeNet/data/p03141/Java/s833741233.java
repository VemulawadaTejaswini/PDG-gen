import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int[] AmB = new int[N];
		//int[] BmA = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();
			AmB[i] = A[i]+B[i];
			//BmA[i] = B[i]-A[i];
		}
		int[] AmBindex = ArrayUtils.argsort(AmB, false);
		//int num = N%2==0? N/2-1 : N/2;
		long scoreA = 0;
		//int scoreB = 0;
		for(int i=0;i<N;i++) {
			if (i%2==0) scoreA += A[AmBindex[i]];
			else scoreA -= B[AmBindex[i]];
		}
		/*
		for(int i=num+1;i<N;i++) {
			scoreA -= B[AmBindex[i]];
		}*/
		
		
		System.out.println(scoreA);
	}
	
	public static class ArrayUtils {
	    public static int[] argsort(final int[] a) {
	        return argsort(a, true);
	    }

	    public static int[] argsort(final int[] a, final boolean ascending) {
	        Integer[] indexes = new Integer[a.length];
	        for (int i = 0; i < indexes.length; i++) {
	            indexes[i] = i;
	        }
	        Arrays.sort(indexes, new Comparator<Integer>() {
	            @Override
	            public int compare(final Integer i1, final Integer i2) {
	                return (ascending ? 1 : -1) * Float.compare(a[i1], a[i2]);
	            }
	        });
	        return asArray(indexes);
	    }

	    public static <T extends Number> int[] asArray(final T... a) {
	        int[] b = new int[a.length];
	        for (int i = 0; i < b.length; i++) {
	            b[i] = a[i].intValue();
	        }
	        return b;
	    }

	    public static double[] castOf(final float[] x) {
	        double[] y = new double[x.length];
	        for (int i = 0; i < y.length; i++) {
	            y[i] = x[i];
	        }
	        return y;
	    }

	    public static int[] castOf(final long[] original) {
	        return castOf(original, original.length);
	    }

	    public static int[] castOf(final long[] original, final int newLength) {
	        int[] cast = new int[newLength];
	        int length = Math.min(cast.length, original.length);
	        for (int i = 0; i < length; i++) {
	            long o = original[i];
	            if (o < Integer.MIN_VALUE || o > Integer.MAX_VALUE) {
	                throw new IllegalArgumentException();
	            }
	            cast[i] = (int) o;
	        }
	        return cast;
	    }

	    public static float[][] copyOf(final float[][] x, final int newLength) {
	        float[][] y = new float[newLength][];
	        for (int i = 0; i < y.length; i++) {
	            if (x[i] != null) {
	                y[i] = Arrays.copyOf(x[i], x[i].length);
	            }
	        }
	        return y;
	    }

	    /**
	     * Assigns a random value to each element of the specified array of doubles.
	     */
	    public static void fillRandom(final double[] x, final Random rng) {
	        for (int i = 0; i < x.length; i++) {
	            x[i] = rng.nextDouble();
	        }
	    }

	    private ArrayUtils() {
	    }
	}
}