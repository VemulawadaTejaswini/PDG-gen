import java.util.*;

class Main{
public static void main(String[] args) {
  Scanner reader=new Scanner(System.in);
  long n=reader.nextLong();
  long k=reader.nextInt();
ArrayList<Long> list=new ArrayList<Long>();

list.add(n);
list.add(Math.abs(n-k));
int i=1;
while(list.get(i)<list.get(i-1))
{i++;
  list.add(Math.abs(list.get(i-1)-k));


}
System.out.println(list.get(i-1));


  }
}