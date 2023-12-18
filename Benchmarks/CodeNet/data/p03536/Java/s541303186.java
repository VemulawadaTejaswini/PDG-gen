import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int numPeople = Integer.parseInt(in.readLine());
		
		Person[] people = new Person[numPeople];
		
		for(int i = 0; i < numPeople; i++){
			StringTokenizer st = new StringTokenizer(in.readLine());
			long H = Long.parseLong(st.nextToken());
			long P =	Long.parseLong(st.nextToken());
			
			Person p = new Person(H, P);
			people[i] = p;
		}
		
		Arrays.sort(people);
		//System.err.println(Arrays.toString(people));
		

		long height = 0;
		int numGone = 0;
		for(int i = 0; i < numPeople; i++){
			Person curr = people[i];
			if(curr.H >= height){
				numGone++;
				height+= curr.P;
			}
			else{
				//DO NOTHING
			}
		}
		
		//System.err.println("numGone = " + numGone);
		out.write(numGone + "\n");
		out.close();
		in.close();
	}
	
	public static class Person implements Comparable{
		long H = 0;
		long P = 0;
		public Person(long H, long P){
			this.H = H;
			this.P = P;
		}
		@Override
		public int compareTo(Object o) {
			Person p = (Person) o;
			if(this.P > p.P){
				return 1;
			}else if(this.P < p.P){
				return -1;
			}
			else{
				if(this.H > p.H){
					return 1;
				}
				else if(this.H < p.H){
					return -1;
				}
			}
			return 0;
		}
		
		public String toString(){
			return "P = " + P + "  H = " + H;
		}
		
		
	}
}
