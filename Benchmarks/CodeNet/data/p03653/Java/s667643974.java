import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int length = x + y + z;
		Person[] persons = new Person[length];
		for (int i = 0; i < length; i++) {
		    persons[i] = new Person(i, sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(persons, new Comparator<Person>() {
		    public int compare(Person p1, Person p2) {
		        return p2.xCount - p2.yCount - (p1.xCount - p1.yCount);
		    }
		});
		TreeSet<Person> xTree = new TreeSet<>(new Comparator<Person>() {
		    public int compare(Person p1, Person p2) {
		        int ret =  p2.zCount - p2.xCount - (p1.zCount - p1.xCount);
		        if (ret == 0) {
		            return p1.id - p2.id;
		        } else {
		            return ret;
		        }
		    }
		});
		long xSum = 0;
		for (int i = 0; i < x; i++) {
		    xTree.add(persons[i]);
		    xSum += persons[i].xCount;
		}
		TreeSet<Person> yTree = new TreeSet<>(new Comparator<Person>() {
		    public int compare(Person p1, Person p2) {
		        int ret = p2.zCount - p2.yCount - (p1.zCount - p1.yCount);
		        if (ret == 0) {
		            return p1.id - p2.id;
		        } else {
		            return ret;
		        }
		    }
		});
		long ySum = 0;
		for (int i = x; i < length; i++) {
		    yTree.add(persons[i]);
		    ySum += persons[i].yCount;
		}
		TreeSet<Person> zxTree = new TreeSet<>(new Comparator<Person>() {
		    public int compare(Person p1, Person p2) {
		        int ret = p1.zCount - p1.xCount - (p2.zCount - p2.xCount);
		        if (ret == 0) {
		            return p1.id - p2.id;
		        } else {
		            return ret;
		        }
		    }
		});
		TreeSet<Person> zyTree = new TreeSet<>(new Comparator<Person>() {
		    public int compare(Person p1, Person p2) {
		        int ret = p1.zCount - p1.yCount - (p2.zCount - p2.yCount);
		        if (ret == 0) {
		            return p1.id - p2.id;
		        } else {
		            return ret;
		        }
		    }
		});
		long zxSum = 0;
		long zySum = 0;
		for (int i = 0; i < z; i++) {
		    Person tmp = yTree.pollFirst();
		    zyTree.add(tmp);
		    ySum -= tmp.yCount;
		    zySum += tmp.zCount;
		}
		long max = xSum + ySum + zxSum + zySum;
		for (int i = 0; i < z; i++) {
		    Person tmp = persons[x + i];
		    if (yTree.contains(tmp)) {
		        ySum -= tmp.yCount;
		        yTree.remove(tmp);
		        Person tmp2 = zyTree.pollFirst();
		        zySum -= tmp2.zCount;
		        yTree.add(tmp2);
		        ySum += tmp2.yCount;
		    } else {
		        zyTree.remove(tmp);
		        zySum -= tmp.zCount;
		    }
		    xTree.add(tmp);
		    xSum += tmp.xCount;
		    Person tmp2 = xTree.pollFirst();
		    xSum -= tmp2.xCount;
		    zxTree.add(tmp2);
		    zxSum += tmp2.zCount;
		    max = Math.max(max, xSum + ySum + zxSum + zySum);
		}
	    System.out.println(max);
	}
	
	static class Person {
	    int id;
	    int xCount;
	    int yCount;
	    int zCount;
	    
	    public Person (int id, int xCount, int yCount, int zCount) {
	        this.id = id;
	        this.xCount = xCount;
	        this.yCount = yCount;
	        this.zCount = zCount;
	    }
	    
	    public int hashCode() {
	        return id;
	    }
	    
	    public boolean equals(Object o) {
	        Person p = (Person)o;
	        return id == p.id && xCount == p.xCount && yCount == p.yCount && zCount == p.zCount;
	    }
	    
	    public String toString() {
	        return "x:" + xCount + " y:" + yCount + " z:" + zCount;
	    }
	}
}
	
