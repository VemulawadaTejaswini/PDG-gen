import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main{
		public static void hit_and_blow(ArrayList<String> list){
			int hit,blow;
			String str_a,str_b;
			ArrayList <Integer> list_a = new ArrayList<Integer>();
			ArrayList <Integer> list_b = new ArrayList<Integer>();
			
			for(int i=0;i<list.size()/2;i++){
				str_a = list.get(i*2);
				str_b = list.get(i*2+1);
				
				list_a.clear();
				list_b.clear();
				
				String [] strAry_a = new String[str_a.length()];
				strAry_a = str_a.split(" ");
				for(int j=0;j<strAry_a.length;j++){
					Pattern p = Pattern.compile("[0-9]*");
					Matcher m = p.matcher(strAry_a[j]);
					if(m.find()){
					int x = Integer.valueOf(m.group(0)).intValue();
					list_a.add(x);
					}
				}
				
				String [] strAry_b = new String[str_b.length()];
				strAry_b = str_b.split(" ");
				for(int j=0;j<strAry_b.length;j++){
					Pattern p = Pattern.compile("[0-9]*");
					Matcher m = p.matcher(strAry_b[j]);
					if(m.find()){
					int x = Integer.valueOf(m.group(0)).intValue();
					list_b.add(x);
					}
				}
				
				for(int j=0;j<list_a.size();j++)
					System.out.print(list_a.get(j) + " ");
				System.out.println("");
				for(int j=0;j<list_a.size();j++)
					System.out.print(list_b.get(j) + " ");
				System.out.println("");
				
				hit = 0;
				blow = 0;
				for(int j=0;j<list_a.size();j++){
					if(list_a.get(j) == list_b.get(j))
						hit++;
				}
				for(int j=0;j<list_a.size();j++){
					for(int k=0;k<list_b.size();k++){
						if(j != k && list_a.get(j) == list_b.get(k))
							blow++;
					}
				}
				System.out.println(hit + " " + blow);
			}
		}
		
		public static void main(String args[]) throws IOException{
			String str;
			ArrayList <String> inp = new ArrayList<String>();

			Scanner scan = new Scanner(System.in);
			scan.useDelimiter("\n");
			
			while(scan.hasNext()){
				str = scan.next();
				inp.add(str);
			}
			hit_and_blow(inp);
		}
}