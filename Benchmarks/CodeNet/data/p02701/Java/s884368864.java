import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class main
{
	public static void main (String args[])throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
		String[] prize=new String[n];
		String[] fprize=new String[n];
		
		for(int i=0;i<n;i++){
			prize[i]=br.readLine();
		}
		int k=0;
		for(int i=0;i<n;i++){
			int flag=0;
			for(int j=0;j<i;j++){
				if(prize[i].equals(prize[j])){
					flag=1;
				}
			}
			if(flag==0){
				fprize[k]=prize[i];
				k++;
			}
		}
        for(int i=0;i<k;i++){
			System.out.println(fprize[i]);
		}

	}
}
