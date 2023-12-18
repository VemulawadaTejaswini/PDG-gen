import java.util.*;


class Main{
public static void main(String[] args) {
  Scanner reader=new Scanner(System.in);
  int k=reader.nextInt();
ArrayList<Long> a= new ArrayList<Long>();
long i=1;
while(true)
{


  if(i<10)
  {
    a.add(i);

    if(i==k)
    {
      System.out.println(a.get((int)i-1));
    return;
  }
  i++;
    continue;
  }


ArrayList<Long> old= new ArrayList<Long>();
ArrayList<Long> t=old;

old = a;
a= t;
  int w=0;
for(int x=0;x<old.size();x++)
{


for(long m=-1;m<2;m++)
      {
        long d=old.get((int)x)%10+m;
        if(d>=0&&d<10){

        a.add(d+old.get((int)x)*10);

        w++;
        if(w==k)
        {
          System.out.println(a.get(k-10));
        return;
      }
      }
    }
  }

}
}
}