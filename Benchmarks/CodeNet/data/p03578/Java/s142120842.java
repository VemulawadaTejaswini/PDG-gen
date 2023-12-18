import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
		
		br.readLine();
		
		List<Integer> problems = Arrays
    							 .stream(br.readLine().split(" "))
    							 .map(Integer::parseInt)
    							 .collect(Collectors.toList());
								  
		int m = Integer.parseInt(br.readLine());
		
		List<Integer> ideas = Arrays
						  .stream(br.readLine().split(" "))
						  .map(Integer::parseInt)
						  .collect(Collectors.toList());
									  
		for(int i = 0; i < m; i++){
		    int n = problems.indexOf(ideas.get(i));
		    
		    if(n == -1){
		        writer.println("No");
		        writer.close();
		        return;
		    }else problems.remove(n);
		}
		writer.println("Yes");
		writer.close();
	}
}