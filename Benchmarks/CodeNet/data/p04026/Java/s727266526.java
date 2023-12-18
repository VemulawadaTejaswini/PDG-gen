import java.io.*;
public class Main
{
	public static void main(String args[])
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
		
			String str = br.readLine();
			String data[] = new String[str.length()];
			int data2[] = new int[str.length()];
			int flag = 0;
			
			if(str.length() < 2){
				flag=-1;
			}

//moji kiridasi
			for(int i=0;i<str.length();i++){
				data[i]=str.substring(i,i+1);
				data2[i]=0;
			}
			
			int max = 0;
			int max_i = 0;
//moji hikaku->kasan
			for(int i=0;i<str.length();i++){
				for(int j=0;j<str.length();j++){
					if(data[i].equals(data[j])){
						data2[i]++;
						if(max < data2[i]){
							max = data2[i];
							max_i = i;
						}
					}
				}
			}
			
			int start=str.length()+1, end=-1;
			for(int i=0;i<str.length();i++){
				if(start > i && data[i].equals(data[max_i])){
					start = i;
				}
				if(end < i && data[i].equals(data[max_i])){
					end = i;
				}
			}

			if(flag==-1 || max<=1){
				System.out.println("-1 -1");
			}else{
				start++;
				end++;
				System.out.println(start+" "+end);
			}


		} catch (Exception e) {
			// System.out.println(e);
        }
	}
}
