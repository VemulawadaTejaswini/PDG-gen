import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int N = 0;
		List<Integer> A = null, B = null, C = null;
		List<Integer> aIndex = new ArrayList<Integer>();
		List<Integer> bIndex = new ArrayList<Integer>();
		try {
			N = Integer.parseInt(br.readLine().trim());
			A = Arrays.asList((br.readLine().trim().split(" "))).stream().map(x -> Integer.parseInt(x))
					.collect(Collectors.toList());
			B = Arrays.asList((br.readLine().trim().split(" "))).stream().map(x -> Integer.parseInt(x))
					.collect(Collectors.toList());
			C = Arrays.asList((br.readLine().trim().split(" "))).stream().map(x -> Integer.parseInt(x))
					.collect(Collectors.toList());
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Collections.sort(A);
		Collections.sort(B);
		Collections.sort(C);
		
		for(Integer a : A){
			aIndex.add(binarySearch(B, a));
		}
		for(Integer b : B){
			bIndex.add(binarySearch(C, b));
		}
		int res = 0;
		for(Integer a_i : aIndex){
			if (a_i == -1){
				continue;
			}else{
				for (Integer b_i : B){
					res += (N - b_i);
				}
			}
		}
		System.out.println(res);	
	}
	
	public static int binarySearch(List<Integer>array, int num){
		int n = array.size();
		if (array.get(n-1) <= num){
			return -1;
		}
		int l = -1;
		int r = n-1;
		while(r - l > 1){
			int mid = (l + r) /2;
			if (array.get(mid) <= num){
				l = mid;
			}else{
				r = mid;
			}
		}		
		return r;
	}
}