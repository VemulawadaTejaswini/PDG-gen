import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int length = Integer.parseInt(br.readLine());
	String strArray[] = br.readLine().split(" ");

	List<String> list = new ArrayList<String>();
	for (int i = 0; i < length; i++) {
	    list.add(strArray[i]);
	}

	List<String> newList = new ArrayList<String>(new HashSet<>(list));

	if (list.size() == newList.size())
	    System.out.println("YES");
	else
	    System.out.println("NO");
    }
}