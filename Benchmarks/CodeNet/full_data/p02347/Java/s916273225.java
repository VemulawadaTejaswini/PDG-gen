import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
 
public class Main {
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO ?????????????????????????????????????????????
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int n = Integer.parseInt(br.readLine());
         
        //PointArray parray = new PointArray(n);
        Point[] pArray = new Point[n];
        
        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        
         
        for(int i = 0; i < n; i++){
            String[] tmpArray = br.readLine().split(" ");
            int x = Integer.parseInt(tmpArray[0]);
            int y = Integer.parseInt(tmpArray[1]);
            
            if(x > maxX){
            	maxX = x;
            }
            if(x < minX){
            	minX = x;
            }
            if(y > maxY){
            	maxY = y;
            }
            if(y < minY){
            	minY = y;
            }
             
//            parray.addPoint(x, y);
            pArray[i] = new Point(x, y);
        }
        //System.out.println(maxX+" "+minX+" "+maxY+" "+minY);
        
        boolean isVertical = false;
        boolean isHorizonal = false;
        if(maxX == minX){
        	isVertical = true;
        }
        if(maxY == minY){
        	isHorizonal = true;
        	
        	Arrays.sort(pArray, new Comparator<Point>(){
        		public int compare(Point p1, Point p2){
        			if(p1.x > p2.x){
        				return 1;
        			}
        			else if(p1.x > p2.x){
        				return -1;
        			}
        			else {
        				return 0;
        			}
        		}
        	});
        }
         
        TwoDTree tree = null;
        if(!isHorizonal && !isVertical){
        	tree = new TwoDTree(pArray, n);
        }
        int q = Integer.parseInt(br.readLine());
         
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < q; i++){
            String[] tmpArray = br.readLine().split(" ");
            int sx = Integer.parseInt(tmpArray[0]);
            int tx = Integer.parseInt(tmpArray[1]);
            int sy = Integer.parseInt(tmpArray[2]);
            int ty = Integer.parseInt(tmpArray[3]);
            Rectangle2D.Double rect = new Rectangle2D.Double(sx, sy, tx - sx, ty - sy);
             
            ArrayList<Integer> list = new ArrayList<Integer>();
            
            if(isVertical){
            	System.out.println("Vertical");
            }
            //?¨??????´????????´????????¢?´¢
            else if (isHorizonal){
            	//System.out.println("Horizonal");
            	if(minY > ty){
            		System.out.println("UNDER");
            	}
            	
            	else if(maxY < sy){
            		System.out.println("ABOVE");
            	}
            	else {
            		int left = Arrays.binarySearch(pArray, new Point(sx - 1, 0), new Comparator<Point>(){
            				public int compare(Point p1, Point p2){
            					if(p1.x > p2.x){
            						return 1;
            					}
            					else if(p1.x == p2.x){
            						return 0;
            					}
            					else {
            						return -1;
            					}
            				}
            			}
            		);
            		
            		if(left < 0){
            			left = -(left + 1);
            		}
            		
            		int right = Arrays.binarySearch(pArray, new Point(tx + 1, 0), new Comparator<Point>(){
        				public int compare(Point p1, Point p2){
        					if(p1.x > p2.x){
        						return 1;
        					}
        					else if(p1.x == p2.x){
        						return 0;
        					}
        					else {
        						return -1;
        					}
        				}
        			}
        		);
            		
            	if(right < 0){
            		right = -(right+1);
            	}
            	//System.out.println("right "+right);
        		
        		if(left < 0){
        			left = -(left + 1);
        		}
            		//System.out.println("left "+left);
            		
            		for(int j = left; j < pArray.length && j < right; j++){
            			int px = pArray[j].x;
            			int py = pArray[j].y;
            			if(sx <= px && tx >= px
            					&& sy <= py && ty >= py){
            				//System.out.println("HIT!!");
            				list.add(pArray[j].id);
            			}
            		}
            	}
            }
            else {
            	tree.inRange(tree.head, rect, false, list);

            	Collections.sort(list);
            }

//            StringBuffer sb = new StringBuffer();
            for(int j = 0; j < list.size() ; j++){
//            	System.out.println(list.get(j));
            	sb.append(list.get(j)+"\n");
            }
            //System.out.println();
           
            sb.append("\n");
//            System.out.print(sb);
            
            //parray.printPoint(sx, tx, sy, ty);
            //System.out.println(rect.contains(new Point2D.Double(4,2)));
        }
        
        System.out.print(sb);
 
    }
 
}
 
class PointArray {
    private Point[] array;
    private int currentIndex = 0;
     
    public PointArray(int n){
        array = new Point[n];
    }
     
    public void addPoint(int x, int y){
        array[currentIndex] = new Point(x, y);
        currentIndex++;
    }
     
    public void printPoint(int x1, int x2, int y1, int y2){
        int count = 0;
         
        for(int i = 0; i < array.length ; i++){
            Point p = array[i];
            if(p.x >= x1 && p.x <= x2 && p.y >= y1 && p.y <= y2){
                System.out.println(i);;
            }
        }
         
        if(count == 0){
            System.out.println();
        }
    }
}

class TwoDTree {
	Node head;
	Node t;
	Node z;
	
	public TwoDTree(Point[] parray, int n){
//		int i;
		//Point pzero = new Point(0, 0);
		Point pzero = new Point(-1000000001, -1000000001);
		pzero.info = 0;
		z = new Node(pzero);
		head = new Node(null);
		head.right = z;
		head.point = pzero;
		for(int i = 0; i < n; i++){
			insert(parray[i]);
		}
	}
	
	void insert (Point p){
//		if(p.x == 0 && p.y == 0){
//			return;
//		}
		Node f = null;
		boolean d, td = false;
//		System.out.println("NODE POINT ("+p.x+","+p.y+") will be insert");
		
		for(d = false, t = head; t != z ; d = !d){
			//System.out.println("INSERT");
			if(p == null){
				System.out.println("P is null");
			}
			if(t == null){
				System.out.println("t is null");
			}
			if(t.point == null){
				System.out.println("t.point is null");
			}
			if(d){
				td = p.x < t.point.x;
			}
			else {
				td = p.y < t.point.y;
			}
			f = t;
			if(td){
				t = t.left;
			}
			else {
				t = t.right;
			}
		}
		
		t = new Node(p);
		t.left = z;
		t.right = z;
		
		if(td){
			f.left = t;
		}
		else {
			f.right = t;
		}
		
//		System.out.println("INSERTED");
	}
	
	void inRange(Node t, Rectangle2D.Double rect, boolean d, ArrayList<Integer> list) {
//		System.out.println("CURRENT NODE POINT ("+t.point.x+","+t.point.y+")");
		boolean t1, t2, tx1, tx2, ty1, ty2;
		if(t == z){
			return;
		}
		tx1 = rect.x < t.point.x;
		tx2 = t.point.x <= rect.x + rect.width;
		ty1 = rect.y < t.point.y;
		ty2 = t.point.y <= rect.y + rect.height;
		t1 = d ? tx1 : ty1;
		t2 = d ? tx2 : ty2;
		if(t1){
			//System.out.println("SEARCH LEFT");
			inRange(t.left, rect, !d, list);
		}
//		if(rect.contains(t.point.toPoint2d())){
		if(rect.x <= t.point.x && rect.x + rect.width >= t.point.x
				&& rect.y <= t.point.y && rect.y + rect.height >= t.point.y){
			//INSIDE!
//			System.out.println("POINT "+t.point.id+" INSIDE");
			list.add(t.point.id);
		}
		if(t2){
			//System.out.println("SEARCH RIGHT");

			inRange(t.right, rect, !d, list);
		}
	}

}

class Node {
	Point point;
	Node right;
	Node left;
	
	public Node(Point p){
		point = p;
		right = null;
		left = null;
	}
}

interface IMultiPoint {
	int dimensionality();
	double getCoordinate(int dx);
	double distance(IMultiPoint imp);
	double[] raw();
}
class Point {
    int x;
    int y;
    int info;
    int id;
    private static int idseed = 0;
     
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        
        this.id = idseed;
        idseed++;
    }
    
    public Point2D.Double toPoint2d(){
    	return new Point2D.Double(x, y);
    }
}