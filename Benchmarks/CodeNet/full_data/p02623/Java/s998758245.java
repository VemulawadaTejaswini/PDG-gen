import java.text.DecimalFormat;
import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String[] lo = reader.readLine().split(" ");
	int N = Integer.parseInt(lo[0]);
	int M = Integer.parseInt(lo[1]);
	int K = Integer.parseInt(lo[2]);
	int[] list1 = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	int[] list2 = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	int i = 0;
	int j = 0;
	int res=  0;
	while((i<N || j<M)&& K>0){
		if(i<N && j<K){
			if(list1[i]<list2[j]){
				if(K>=list1[i]){
				       	K-=list1[i];
					res++;
				}
				else break;
				i++;
			}
			else{
				if(K>=list2[j])
				{
					K-=list2[j];
					res++;
				}
				else break;
				j++;
			}
		}
		else if(i>=N && j<M){
			if(K>=list2[j]){
			       	K-=list2[j];
				res++;
			}
			else break;
			j++;
		}
		else if(i<N && j>=M){
			if(K>=list1[i]){
				K-=list1[i];
				res++;
			}
			else break;
			i++;
		}
		else{
			break;
		}
	}
	System.out.println(res);
	}
}
