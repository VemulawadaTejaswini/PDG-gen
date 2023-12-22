import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int length = (int)(Math.pow(3, n));
		Person.size = n;
		Person[] persons = new Person[length];
		for (int i = 0; i < length; i++) {
		    persons[i] = new Person(i);
		}
		ArrayList<Integer> list = new ArrayList<>();
		char[] arr = sc.next().toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] == 'R') {
		        count++;
		    } else {
		        if (i < arr.length - 1 && arr[i + 1] == 'S') {
		            i++;
		        } else {
		            list.add(count);
		            count = 0;
		        }
		    }
		}
		list.add(count);
		int[] arrList = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
		    arrList[i] = list.get(i);
		}
		Person.list = arrList;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
		    if (i > 0) {
		        sb.append(" ");
		    }
		    persons[i].calc();
		    sb.append(persons[i].getValue());
		}
		System.out.println(sb);
	}
	
	static class Person {
	    static int size;
	    static int[] list;
	    int[] base;
	    
	    public Person(int value) {
	        base = new int[size];
	        for (int i = 0; i < size && value > 0; i++) {
	            base[i] = value % 3;
	            value /= 3;
	        }
	    }
	    
	    public void calc() {
	        int idx = 0;
	        while (list.length - idx > 2) {
	            int first = list[idx];
	            int second = list[idx + 1];
	            for (int i = 0; i < size && (first > 0 || second > 0); i++) {
	                int modF = first % 3;
	                int modS = second % 3;
	                first /= 3;
	                second /= 3;
	                if (modF == 0 && modS == 0) {
	                    continue;
	                }
	                if (base[i] == 0) {
	                    if (modF == 0 && modS == 1) {
	                        base[i] = 2;
	                    } else if (modF == 0 && modS == 2) {
	                        base[i] = 1;
	                    } else if (modF == 1 && modS == 0) {
	                        base[i] = 1;
	                    } else if (modF == 1 && modS == 1) {
	                        base[i] = 0;
	                        second++;
	                    } else if (modF == 1 && modS == 2) {
	                        base[i] = 2;
	                        second++;
	                    } else if (modF == 2 && modS == 0) {
	                        base[i] = 2;
	                    } else if (modF == 2 && modS == 1) {
	                        base[i] = 1;
	                    } else if (modF == 2 && modS == 2) {
	                        base[i] = 0;
	                        second++;
	                    }
	                } else if (base[i] == 1) {
	                    if (modF == 0 && modS == 1) {
	                        base[i] = 0;
	                        second++;
	                    } else if (modF == 0 && modS == 2) {
	                        base[i] = 2;
	                        second++;
	                    } else if (modF == 1 && modS == 0) {
	                        base[i] = 2;
	                    } else if (modF == 1 && modS == 1) {
	                        base[i] = 1;
	                    } else if (modF == 1 && modS == 2) {
	                        base[i] = 0;
	                        second++;
	                    } else if (modF == 2 && modS == 0) {
	                        base[i] = 0;
	                        first++;
	                    } else if (modF == 2 && modS == 1) {
	                        base[i] = 2;
	                        first++;
	                    } else if (modF == 2 && modS == 2) {
	                        base[i] = 1;
	                        first++;
	                    }
	                } else if (base[i] == 2) {
	                    if (modF == 0 && modS == 1) {
	                        base[i] = 1;
	                    } else if (modF == 0 && modS == 2) {
	                        base[i] = 0;
	                        second++;
	                    } else if (modF == 1 && modS == 0) {
	                        base[i] = 0;
	                        first++;
	                    } else if (modF == 1 && modS == 1) {
	                        base[i] = 2;
	                        first++;
	                    } else if (modF == 1 && modS == 2) {
	                        base[i] = 1;
	                        first++;
	                    } else if (modF == 2 && modS == 0) {
	                        base[i] = 1;
	                        first++;
	                    } else if (modF == 2 && modS == 1) {
	                        base[i] = 0;
	                        first++;
	                        second++;
	                    } else if (modF == 2 && modS == 2) {
	                        base[i] = 2;
	                        first++;
	                        second++;
	                    }
	                }
	            }
	            idx += 2;
	        }
	        if (list.length - idx == 2) {
	            int x = list[idx];
	            for (int i = 0; i < size; i++) {
	                if (x > 0) {
    	                int mod = x % 3;
    	                x /= 3;
                        if (base[i] + mod >= 3) {
                            x++;
                        }
                        base[i] = (base[i] + mod) % 3;
	                }
	                if (base[i] == 1) {
	                    base[i] = 2;
	                } else if (base[i] == 2) {
	                    base[i] = 1;
	                }
	            }
	            idx++;
	        }
            int x = list[idx];
            for (int i = 0; i < size && x > 0; i++) {
                int mod = x % 3;
                x /= 3;
                if (base[i] + mod >= 3) {
                    x++;
                }
                base[i] = (base[i] + mod) % 3;
            }
 	    }
	    
	    public int getValue() {
	        int ans = 0;
	        for (int i = size - 1; i >= 0; i--) {
	            ans *= 3;
	            ans += base[i];
	        }
	        return ans;
	    }
	}
}
