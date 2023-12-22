
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int n;
		int m;
		
		while(true)
		{
			n = scan.nextInt();
			m = scan.nextInt();
			
			if(n == 0 && m == 0)
			{
				//terminate
				return;
			}
			else
			{
				new DataSet(n, m);
			}
		}
	}
	
	static class DataSet
	{
		int numOfRecipes;
		int numOfMats;
		List<Recipe> recipes = new ArrayList<Recipe>();
		
		//must use even number of each material
		//make only 1 max of each recipe
		public DataSet(int n, int m)
		{
			numOfRecipes = n;
			numOfMats = m;
			
			
			for(int i = 0; i < numOfRecipes; i++)
			{
				//make recipe
				recipes.add(new Recipe());
				
				//input needness for each recipe.
				
				String neednessString = scan.next();
				
				
				for(int j = 0; j < numOfMats; j++)
				{ //load materials into recipes
					int curNeedness = Integer.parseInt(neednessString.substring(j, j+1));
					recipes.get(i).addNeedness(    curNeedness        );
				}
			}
			
			System.out.println(attempt(""));
			
			//try all teh combinations!!!
			
			
		}
		
		public int attempt(String n) //n example -> "1011" -> make, dont make, make, make
		{
			if(n.length() < (numOfRecipes))
			{
				int a = attempt(n+"0");
				int b = attempt(n+"1");
				
				if(a >= b)
				{
					return a;
				}
				else
				{
					return b;
				}
			}
			else// if(n.length() == (numOfRecipes))
			{ //last recipe defined. compute.
				
				List<Integer> reqList = new ArrayList<Integer>();
				int howManyRecipes = 0;
				
				for(int i = 0; i < numOfMats; i++)
				{
					reqList.add(0);
				}
				
				//before we can check if this is okay (all mats even)
				//we need to see what mats we need in the first place.
				
				for(int i = 0; i < numOfRecipes; i++)
				{
					int makeOrNot = Integer.parseInt( n.substring(i, i+1) );
					
					if(makeOrNot == 1)
					{
						howManyRecipes += 1;
						//make this recipe: add mats to req list.
						for(int j = 0; j < numOfMats; j++)
						{
							reqList.set(    j         ,  reqList.get(j) + recipes.get(i).needThisMat.get(j)        );
						}
					}
				}
				
				//now check the ReqList to see if it's okay
				for(int j = 0; j < numOfMats; j++)
				{
					if( reqList.get(j)%2 != 0) //something's not even
					{
						return 0; //unacceptable!!!
					}
				}
				
				//if it's okay, return how many recipes we can make.
				
				return howManyRecipes;
			}
		}
	}
	
	static class Recipe
	{
		List<Integer> needThisMat = new ArrayList<Integer>();
		
		public Recipe()
		{
		}
		
		public void addNeedness(int need)
		{
			needThisMat.add(need);
		}
	}
}

