tring allStringsSupersetSoFar = NStrings[0] /* first input String */

for(int i = 1; i < NStrings.length; i++)
{
	allStringsSupersetSoFar = formSuperSetsoFar(NStrings[i], allStringsSupersetSoFar);
}

/*  
 * Given two strings, finds the superset string in lexicographic order for
 * which both the input strings are subsequences
 */
String formSuperSetsoFar(String ithString, String allStringsSupersetSoFar)
{
	int m = allStringsSupersetSoFar.length();
        int n = ithString.length();
        int i, j = 0; /* i - index to allStringsSupersetSoFar and j - index to ithString 
        StringBuilder superSetString = new StringBuilder();
        while ( i < m && j < n)
	{
		if(allStringsSupersetSoFar [i] < ithString[j]) 
		{
			superSetString.append(allStringsSupersetSoFar [i]);
			i++;
		}
		else if (allStringsSupersetSoFar [i] > ithString[j])
		{
			superSetString.append(ithString[j]);
			j++;
		}
		else
		{
			i++; j++;
			superSetString.append(allStringsSupersetSoFar [j]);
		}
	}
        
        if(j < n)
	{
		superSetString.append(ithString.substring(j+1));
	}   

	if(i < m)
	{
				superSetString.append(allStringsSupersetSoFar.substring(i+1));
	}
	return superSetString;
}