import java.util.Scanner;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Arrays;
class Record
{
    int id;
    int uriage;
    int jyun;

    Record(int id, int uriage, int jyun)
    {
	this.id = id;
	this.uriage = uriage;
	this.jyun = jyun;
    }
    
    int getId()
    {
	return this.id;
    }
    int getUriage()
    {
	return this.uriage;
    }
    int getJyun()
    {
	return this.jyun;
    }
    int addUriage(int uri)
    {
	this.uriage += uri;
	return this.uriage; 
    }
}

class CmpJyun implements Comparator<Record> {
    public int compare(Record record1, Record record2) {
	return record1.getJyun() - record2.getJyun();
  }
}

public class Main
{
    public static void main(String[] args)
    {
	final int lim=1000000;
	CmpJyun rc = new CmpJyun();
	Scanner scan = new Scanner(System.in);
	while (true) {
	    HashMap<Integer,Record> h = new HashMap<Integer,Record>();
	    int n = scan.nextInt();
	    if (n==0) 
		break;

	    for (int jyun=0; jyun<n; jyun++){
		int id    = scan.nextInt();
		int tanka = scan.nextInt();
		int ryou  = scan.nextInt();
		if  (h.containsKey(id)){
		    h.get(id).addUriage(tanka*ryou);
 		} else {
		    h.put(id,new Record(id, tanka*ryou, jyun));
		}
	    }

	    Record[] rec = new Record[h.size()];
	    int j=0;
	    for (Integer id : h.keySet()) {
		rec[j] = h.get(id);
		j += 1;
	    }
	    boolean none=true;
	    Arrays.sort(rec, rc);
	    for (int i=0; i<h.size(); i++){
		if (rec[i].getUriage() >= lim){
		    System.out.println(rec[i].getId());
		    none=false;
		}
	    }
	    if (none)
		System.out.println("NA");
	}
    }
}